import pickle

def save_contacts_to_binary_file(filename, contacts):
    try:
        with open(filename, 'wb') as file:
            pickle.dump(contacts, file)
    except Exception as e:
        print(f"Error writing to binary file: {e}")

def load_contacts_from_binary_file(filename):
    try:
        with open(filename, 'rb') as file:
            contacts = pickle.load(file)
            return contacts
    except FileNotFoundError:
        print(f"Binary file '{filename}' not found.")
    except Exception as e:
        print(f"Error reading from binary file: {e}")
    return []
