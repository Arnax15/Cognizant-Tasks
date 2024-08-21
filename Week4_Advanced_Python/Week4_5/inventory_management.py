
product_names = ["Apple", "Banana", "Cherry"]

def add_product(name):
    product_names.append(name)

def remove_product(name):
    if name in product_names:
        product_names.remove(name)
    else:
        print(f"{name} not found in the list")

def update_product(old_name, new_name):
    if old_name in product_names:
        index = product_names.index(old_name)
        product_names[index] = new_name
    else:
        print(f"{old_name} not found in the list")

product_details = {"Apple": {"quantity": 10, "price": 1.00}, "Banana": {"quantity": 20, "price": 0.50}}

def add_product_detail(name, quantity, price):
    product_details[name] = {"quantity": quantity, "price": price}

def update_product_detail(name, quantity=None, price=None):
    if name in product_details:
        if quantity is not None:
            product_details[name]["quantity"] = quantity
        if price is not None:
            product_details[name]["price"] = price
    else:
        print(f"{name} not found in the dictionary")

def delete_product_detail(name):
    if name in product_details:
        del product_details[name]
    else:
        print(f"{name} not found in the dictionary")

product_catalog = (("Apple", 10, 1.00), ("Banana", 20, 0.50), ("Cherry", 30, 2.00))

def search_product_catalog(name):
    for product in product_catalog:
        if product[0] == name:
            return product
    return None

product_categories = {"Fruit", "Vegetable", "Dairy"}

def add_product_category(category):
    product_categories.add(category)

def remove_product_category(category):
    if category in product_categories:
        product_categories.remove(category)
    else:
        print(f"{category} not found in the set")

def main():
    print("Lists:")
    print(product_names)
    add_product("Orange")
    print(product_names)
    remove_product("Banana")
    print(product_names)
    update_product("Apple", "Apple Pie")
    print(product_names)

    print("\nDictionaries:")
    print(product_details)
    add_product_detail("Orange", 30, 2.50)
    print(product_details)
    update_product_detail("Apple", quantity=20)
    print(product_details)
    delete_product_detail("Banana")
    print(product_details)

    print("\nTuples:")
    print(product_catalog)
    result = search_product_catalog("Apple")
    if result:
        print(f"Product found: {result}")
    else:
        print("Product not found")

    print("\nSets:")
    print(product_categories)
    add_product_category("Meat")
    print(product_categories)
    remove_product_category("Vegetable")
    print(product_categories)

if __name__ == "__main__":
    main()
