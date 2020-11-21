 class Person {
    private final String fio;
    private final String post;
    private final String email;
    private final String tel;
    private final double salary;
    private int age;

    Person(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Сотрудник должен быть старше 18 лет");
        }
    }

    int GetAge() {
        return age;
    }

    void Show() {
        System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
    }
}



public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Petrov Petr Petrovich", "Head of a Sales Department ", "petrovpp_60@mailbox.com", "8923012312", 210000, 60);
        persArray[1] = new Person("Rogachev Roman Igorevich", "Senior manager", "rogachevri@mailbox.com", "89230123045", 170000, 50);
        persArray[2] = new Person("Sidorov Oleg Olegovich", "Manager", "sidorovoo@mailbox.com", "8923015687", 120000, 45);
        persArray[3] = new Person("Ivanov Ivan Ivanovich", "Manager", "ivanovii@mailbox.com", "8923018997", 100000, 35);
        persArray[4] = new Person("Pavlov Alexand Olegovich", "Intern", "ivivan4@mailbox.com", "89230124481", 30000, 20);

        for(Person item : persArray) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}
