from  Progression import Progression
from GeometricProgression import GeometricProgression
from ArithmeticProgression import ArithmeticProgression
from FibonacciProgression import FibonacciProgression

if __name__ == '__main__':
    # test default progression
    print("Default progression")
    Progression().print_progression(10)

    # test arithmetic progression
    print("Arithmetic progression with default increment 1")
    ArithmeticProgression().print_progression(10)

    print("Arithmetic progression with increment 5")
    ArithmeticProgression(increment=5).print_progression(10)

    print("Arithmetic progression with start 10 increment 3")
    ArithmeticProgression(increment=3, start=10).print_progression(10)

    # test geometric progression
    print("Geometric Progression with default base:")
    GeometricProgression().print_progression(10)

    print("Geomertic Progression with base 3")
    GeometricProgression(3).print_progression(10)

    # test fibonacci progression
    print("Fibonacci progression with default first and second terms")
    FibonacciProgression().print_progression(10)

    print("Fibonacci progression with first 5 second 10")
    FibonacciProgression(5, 10).print_progression(10)
