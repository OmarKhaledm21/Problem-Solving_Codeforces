

class Pair:
    index = 0
    max_h = 0

    def __init__(self, index, max_h) -> None:
        self.index = index
        self.max_h = max_h


def get_max_h(pair):
    return pair.max_h


def main():
    n, t1, t2, k = map(int, input().split(" "))
    list_obj = []
    for i in range(0, n):
        sa, sb = map(int,input().split(" "))

        sat1 = sa * t1
        sbt1 = sb * t1

        sat2 = sa * t2
        sbt2 = sb * t2
        per = k/100

        eq1 = (sat1 - (sat1*per)) + sbt2
        eq2 = (sbt1 - (sbt1*per)) + sat2

        max_h = round(max(eq1, eq2), 2)

        p = Pair(i, max_h)

        list_obj.append(p)

    list_obj.sort(key=get_max_h, reverse=True)
    for i in range(0, n):
        print(f"{list_obj[i].index +1} {list_obj[i].max_h:.2f}")


if __name__ == "__main__":
    main()
