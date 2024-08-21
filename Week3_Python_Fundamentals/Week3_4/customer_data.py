def update_purchase(customer_data, name, amount):
    if name in customer_data:
        customer_data[name] = amount
    else:
        print(f"Customer '{name}' not found.")

customer_data = {'Alice': 120, 'Bob': 75, 'Charlie': 90}

update_purchase(customer_data, 'Bob', 100)

print(customer_data)
