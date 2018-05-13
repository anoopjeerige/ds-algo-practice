from Progression import Progression

class ArithmeticProgression(Progression):
    """Iterator producing a arithmetic progression."""

    def __init__(self, increment=1, start=0):
        """ Create a new arithmetic progression.

        increment   a fixed constant to add to each term (default 1)
        start       the first term of the progression (default 0)
        """
        super().__init__(start)
        self._increment = increment

    def _advance(self):
        """Update current value by adding the fixed increment"""
        self._current += self._increment
