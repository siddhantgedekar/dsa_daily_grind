import unittest
from studentScoreAvg import scoreAvg

class TestExample(unittest.TestCase):
    def test_case_one(self):
        records = {'Krishna': [67, 68, 69], 'Arjun': [70, 98, 63], 'Malika': [52, 56, 60]}
        query_name = 'Malika'
        expected_output = 56.00

        self.assertEqual(scoreAvg(records, query_name), expected_output)