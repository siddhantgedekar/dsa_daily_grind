import unittest

from runnerup import runner_up_score

class TestRunnerUp(unittest.TestCase):
    def test_Case1(self):
        input_data = "2 3 6 6 5"
        expected_output = 5
        self.assertEqual(runner_up_score(input_data), expected_output)

if __name__ == "__main__":
    unittest.main()