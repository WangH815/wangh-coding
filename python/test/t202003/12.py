'''
打印三角形
'''


def triangle_print(n):
    for i in range(n):
        print('* ' * (i + 1))

    print('=========')
    for i in range(n):
        print('* ' * (n - i))

    print('=========')
    for i in range(n):
        print(' ' * (n - i - 1), end='')
        print('*' * (2 * i + 1))


triangle_print(5)


class Student(object):
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def study(self, course_name):
        print('{}正在学习{}'.format(self.name, course_name))

    def watch_movie(self):
        if self.age < 18:
            print('正在看熊出没~')
        else:
            print('正在看岛国片~')


my_student = Student('wangh', 25)
my_student.watch_movie()


class Test:
    def __init__(self, foo):
        self.__foo = foo

    def __bar(self):
        print(self.__foo)
        print('__bar')


def main():
    test = Test('hello')
    test._Test__bar()         #访问私有方法
    print(test._Test__foo)    #访问私有属性


if __name__ == "__main__":
    main()
