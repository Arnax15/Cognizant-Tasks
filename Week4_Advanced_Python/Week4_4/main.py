import text_processing_tool

def main():
    text = input("Enter a text string: ")

    print(f"Number of words: {text_processing_tool.count_words(text)}")
    print(f"Unique words: {text_processing_tool.find_unique_words(text)}")
    print(f"Text in uppercase: {text_processing_tool.convert_to_uppercase(text)}")


if __name__ == "__main__":
    main()
