def generate_report(sales):
    total_sales = 0
    for sale in sales:
        if sale > 500:
            print(f"** Sale: ${sale:.2f} **")
        else:
            print(f"Sale: ${sale:.2f}")
        total_sales += sale
    print(f"Total sales for the month: ${total_sales:.2f}")

sales = [200, 600, 150, 800, 300]

generate_report(sales)
