from unittest import TestCase
from parking_lot import park
from parking_lot import remove

class ParkingLotTest(TestCase):
    
    def test_to_park_car_is_working(self):
        self.assertEqual(park(5), "car added successfully")
    
    def test_to_remove_car_is_working(self):
        self.assertEqual(remove(5), "car removed successfully")
