import unittest
from secondSmallest import second_lowest
class TestExample(unittest.TestCase):
    def test_one(self):
        record = [['Harry', 37.21], ['Berry', 37.21], ['Tina', 37.2], ['Akriti', 41], ['Harsh', 39]]
        expected_output = ['Berry', 'Harry']
        self.assertEqual(second_lowest(record), expected_output)

    def test_two(self):
        record = [['Alice', 50], ['Bob', 50], ['Charlie', 45], ['Eve', 45], ['David', 60], ['Frank', 60]]
        expected_output = ['Alice', 'Bob']
        self.assertEqual(second_lowest(record), expected_output)

if __name__ == "__main__":
    unittest.main()