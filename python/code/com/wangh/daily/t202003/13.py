class Person(object):
    __slots__ = ('_name', '_age', '_gender')

    def __init__(self, name, age):
        self._name = name
        self._age = age

    @property
    def name(self):
        return self._name

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, age):
        self._age = age

    def play(self):
        if True:
            pass
        else:
            pass

    @staticmethod
    def my_print():
        print('static print')

    @classmethod
    def class_print(cls):
        print('class print')


def main():
    person = Person('wangh', 25)
    person.play()
    person.age = 22
    person.play()
    Person.my_print()
    Person.class_print()


if __name__ == '__main__':
    main()
