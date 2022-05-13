import Grocery_List
import unittest


class TestGrocery(unittest.TestCase):
    def test_add(self):
        self.assertEqual(Grocery_List.addList(index=5, item='Cake', grocery='Cake'), 2)
        with self.assertRaises(TypeError):
            Grocery_List.addList('Cake', 2, 5)

    def test_remove(self):
        self.assertEqual(Grocery_List.removeList(index=4, shopping='Bread'), 1)
        with self.assertRaises(TypeError):
            Grocery_List.removeList('Bread', 4)


if __name__ == '__main__':
    unittest.main()
