def minus_glasnie():
    glasnie = "aeiouAEIOU"
    string = input("Enter your text: \n ")
    result = ''.join([char for char in string if char not in glasnie])
    return result

output_string = minus_glasnie()
print(output_string)