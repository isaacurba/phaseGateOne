from unittest import TestCase
from two_sum import targeting_sum

class TestToChecKTwoSumLogic(TestCase):

    def test_to_check_sum_of_two_numbers_in_array_get_the_target(self):
        arr = [8, 6, 12, 4, -2]
        target = 6
        expected = [8, -2]
        actual = targeting_sum(arr, target)
        self.assertEqual(expected, actual) # Safer than assertEqual
        
    def test_to_check_sum_of_another_two_numbers_in_array_get_the_target(self):
        arr = [1, 2, 5, 7, 6, 8, 9]
        target = 12
        expected = [5, 7]
        actual = targeting_sum(arr, target)
        self.assertEqual(expected, actual)

    def test_returns_empty_list_if_no_match_found(self):
        arr = [1, 2, 3]
        target = 10
        actual = targeting_sum(arr, target)
        self.assertEqual([], actual)

    def test_handles_duplicate_values(self):
        arr = [3, 3, 4]
        target = 6
        expected = [3, 3]
        actual = targeting_sum(arr, target)
        self.assertEqual(expected, actual)

