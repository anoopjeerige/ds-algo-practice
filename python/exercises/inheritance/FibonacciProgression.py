from Progression import Progression

class FibonacciProgression(Progression):
    """Iterator producing Fibonacci series."""

    def __init__(self, first=0, second=1):
        """Create a new fibonacci progression.

        first   the first term of the progression (default 0)
        second  the second term of the progression (default 1)
        """
        super().__init__(first)
        self._prev = second - first

    def _advance(self):
        """ Replace (prev, current) with (current, current + prev)"""
        self._prev, self._current = self._current, self._current + self._prev
