def transform_roman_numeral_to_number(roman_numeral):
    roman_char_dict = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
    res = 0
    for i in range(0, len(roman_numeral)):
        if i == 0 or roman_char_dict[roman_numeral[i]] <= roman_char_dict[roman_numeral[i - 1]]:
            res += roman_char_dict[roman_numeral[i]]
        else:
            res += roman_char_dict[roman_numeral[i]] - 2 * roman_char_dict[roman_numeral[i - 1]]
    return res


roman_numeral_input = 'MMXXI'
number_output = transform_roman_numeral_to_number(roman_numeral_input)
print('Roman numeral {0} equal to:{1}'.format(roman_numeral_input, number_output))
