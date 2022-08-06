public class Car {
    String mark;
    int price;
    int speed;

    Car() {
        mark = "Audi";
        price = 3000;
        speed = 180;
    }

    Car(String mark, int price) {
        this.mark = mark;
        this.price = price;
    }

    Car(Car a) {
        this.mark = a.mark;
        this.price = a.price;
        this.speed = a.speed;
    }

    void checkSpeed(Car speed) {
        if (this.speed > speed.speed) {
            System.out.println(this.mark + "Быстрее чем " + speed.mark);
        } else if (this.speed < speed.speed) {
            System.out.println(this.mark + "Медленнее чем " + speed.mark);
        }
        else {
            System.out.println(this.mark + "Ровны по скорости " + speed.mark);
        }
    }
}