import threading
import time
import json

class Inventory:
    def __init__(self):
        self.items = {}

    def add_item(self, item, quantity):
        self.items[item] = quantity

    def remove_item(self, item, quantity):
        if item in self.items:
            if self.items[item] >= quantity:
                self.items[item] -= quantity
            else:
                print(f"Not enough {item} in stock")
        else:
            print(f"{item} not found in inventory")

    def check_stock(self, item):
        if item in self.items:
            return self.items[item]
        else:
            return 0

    def save_to_file(self, filename):
        with open(filename, "w") as f:
            json.dump(self.items, f)

    def load_from_file(self, filename):
        try:
            with open(filename, "r") as f:
                self.items = json.load(f)
        except FileNotFoundError:
            print(f"File {filename} not found")

    def restock_alert(self):
        while True:
            for item, quantity in self.items.items():
                if quantity < 10:
                    print(f"Restock alert: {item} is low in stock")
            time.sleep(60)  # check every 60 seconds


def main():
    inventory = Inventory()
    inventory.add_item("apple", 20)
    inventory.add_item("banana", 30)

    threading.Thread(target=inventory.restock_alert).start()

    while True:
        print("1. Add item")
        print("2. Remove item")
        print("3. Check stock")
        print("4. Save to file")
        print("5. Load from file")
        print("6. Exit")
        choice = input("Enter your choice: ")

        if choice == "1":
            item = input("Enter item name: ")
            quantity = int(input("Enter quantity: "))
            inventory.add_item(item, quantity)
        elif choice == "2":
            item = input("Enter item name: ")
            quantity = int(input("Enter quantity: "))
            inventory.remove_item(item, quantity)
        elif choice == "3":
            item = input("Enter item name: ")
            print(f"Stock level of {item}: {inventory.check_stock(item)}")
        elif choice == "4":
            filename = input("Enter filename: ")
            inventory.save_to_file(filename)
        elif choice == "5":
            filename = input("Enter filename: ")
            inventory.load_from_file(filename)
        elif choice == "6":
            break
        else:
            print("Invalid choice")


if __name__ == "__main__":
    main()
