import os

class Contact:
    def __init__(self, name, phone_number, email):
        self.name = name
        self.phone_number = phone_number
        self.email = email

def read_contacts_from_file(filename):
    contacts = []
    try:
        with open(filename, 'r') as file:
            for line in file:
                name, phone_number, email = line.strip().split(',')
                contact = Contact(name, phone_number, email)
                contacts.append(contact)
    except FileNotFoundError:
        print(f"File '{filename}' not found.")
    return contacts

def write_contacts_to_file(filename, contacts):
    try:
        with open(filename, 'w') as file:
            for contact in contacts:
                file.write(f"{contact.name},{contact.phone_number},{contact.email}\n")
    except Exception as e:
        print(f"Error writing to file: {e}")

def add_contact(contacts, name, phone_number, email):
    contact = Contact(name, phone_number, email)
    contacts.append(contact)

def remove_contact(contacts, name):
    for contact in contacts:
        if contact.name == name:
            contacts.remove(contact)
            return
    print(f"Contact '{name}' not found.")

def display_contacts(contacts):
    for contact in contacts:
        print(f"{contact.name}: {contact.phone_number}, {contact.email}")

def main():
    filename = 'contacts.txt'
    contacts = read_contacts_from_file(filename)

    while True:
        print("\nContact Management System")
        print("1. Add contact")
        print("2. Remove contact")
        print("3. Display contacts")
        print("4. Quit")
        choice = input("Choose an option: ")

        if choice == '1':
            name = input("Enter name: ")
            phone_number = input("Enter phone number: ")
            email = input("Enter email: ")
            add_contact(contacts, name, phone_number, email)
            write_contacts_to_file(filename, contacts)
        elif choice == '2':
            name = input("Enter name of contact to remove: ")
            remove_contact(contacts, name)
            write_contacts_to_file(filename, contacts)
        elif choice == '3':
            display_contacts(contacts)
        elif choice == '4':
            break
        else:
            print("Invalid choice. Please choose a valid option.")

if __name__ == '__main__':
    main()
