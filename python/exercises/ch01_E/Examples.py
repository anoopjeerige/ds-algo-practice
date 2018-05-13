class Vector:
    """Represents a vector in multidimensional space"""

    def __init__(self, d):
        """ Create a d-dimension vector of zeros"""
        self._coords = [0] * d

    def __len__(self):
        """Returns the dimension of the vector"""
        return len(self._coords)

    def __getitem__(self, j):
        """Returns the jth coordinated of the vector"""
        return self._coords[j]

    def __setitem__(self, j, val):
        """Set the jth coordinate of the vector to given value"""
        self._coords[j] = val

    def __add__(self, other):
        """Return the sum of two vectors"""
        if len(self._coords) != len(other):
            raise ValueError('Dimensions are not same')
        result = Vector(len(self))
        for i in range(len(self)):
            result[i] = self[i] + other[i]
        return result

    def __eq__(self, other):
        """Return True if vector has same coordinates as other"""
        return self._coords == other._coords

    def __ne__(self, other):
        """Return True if vector differs from other"""
        return not self == other

    def __str__(self):
        """Return a string representation of a vector"""
        return "<" + str(self._coords)[1:-1] + ">"

class SequenceIterator:
    """A iterator for any python's sequence types"""

    def __init__(self, sequence):
        self._seq = sequence
        self._k = -1

    def __next__(self):
        """Return the next element else raise StopIteration error"""
        self._k += 1
        if self._k < len(self._seq):
            return(self._seq[self._k])
        else:
            raise StopIteration()

    def __iter__(self):
        """ By convention, an iterator must return itself as an iterator"""
        return self
