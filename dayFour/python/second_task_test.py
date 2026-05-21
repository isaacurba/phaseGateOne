from unittest import TestCase
from second_task import remove_duplicate

class TestForTheSecondTask(TestCase):
    
    def test_to_remove_duplicate_from_the_array(self):
        arr = [9, 5, 1, 9, 4, 5, 1, 7];
        expected = [9, 5, 1, 4, 7];
        actual = remove_duplicate(arr)
        self.assertEqual(expected, actual)
    
