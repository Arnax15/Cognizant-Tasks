import logging

def process_transaction(transaction_data):
    try:

        if not isinstance(transaction_data, dict):
            raise ValueError("Invalid transaction data")
        if 'amount' not in transaction_data or 'account_number' not in transaction_data:
            raise ValueError("Missing required fields")

    except ValueError as e:
        logging.error(f"Invalid transaction data: {e}")
        print("Error: Invalid transaction data. Please check and try again.")
    except Exception as e:
        logging.error(f"Error processing transaction: {e}")
        print("Error: Unable to process transaction. Please try again later.")

def log_error(message):
    logging.basicConfig(filename='error.log', level=logging.ERROR)
    logging.error(message)

try:
    process_transaction({'amount': 100, 'account_number': '1234567890'})
except Exception as e:
    log_error(f"Error processing transaction: {e}")
