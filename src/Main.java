public class Main {
    public static void main(String[] args) {

        Car chevrolet = new Car("Chevrolet","Camaro",3.6);
        Car alfaRomeo = new Car("Alfa-Romeo","Disco Valante", 2.2);
        Car bmw = new Car("BMW","M5",4.4);
        Car mercedes = new Car("Mercedes-Benz","SLR",6.3);

        chevrolet.getPitStop();
        chevrolet.getBestLapTime();
        chevrolet.getMaxSpeed();
        System.out.println(Car.BodyType.CAR_SEDAN);
        chevrolet.printType();
        System.out.println();

        alfaRomeo.getPitStop();
        alfaRomeo.getBestLapTime();
        alfaRomeo.getMaxSpeed();
        System.out.println(Car.BodyType.CAR_COUPE);
        alfaRomeo.printType();
        System.out.println();

        bmw.getPitStop();
        bmw.getBestLapTime();
        bmw.getMaxSpeed();
        System.out.println(Car.BodyType.CAR_HATCHBACK);
        bmw.printType();
        System.out.println();

        mercedes.getPitStop();
        mercedes.getBestLapTime();
        mercedes.getMaxSpeed();
        System.out.println(Car.BodyType.CAR_UNIVERSAL);
        mercedes.printType();
        System.out.println();

        Driver<Car> mike = new Driver<>("Mike","Категория B", 10);
        mike.startMoving(chevrolet);
        System.out.println();
        Race.diagnosticTransport(chevrolet, alfaRomeo, bmw, mercedes);
        System.out.println();

        Truck kamaz = new Truck("Kamaz","Master",5.0);
        Truck volvo = new Truck("Volvo","Iron Knight",12.8);
        Truck man = new Truck("MAN","TGS",10.0);
        Truck scania = new Truck("Scania","R500",12.0);

        kamaz.getPitStop();
        kamaz.getBestLapTime();
        kamaz.getMaxSpeed();
        System.out.println(Truck.LoadCapacity.N3);
        kamaz.printType();
        System.out.println();

        volvo.getPitStop();
        volvo.getBestLapTime();
        volvo.getMaxSpeed();
        System.out.println(Truck.LoadCapacity.N2);
        volvo.printType();
        System.out.println();

        man.getPitStop();
        man.getBestLapTime();
        man.getMaxSpeed();
        System.out.println(Truck.LoadCapacity.N1);
        man.printType();
        System.out.println();

        scania.getPitStop();
        scania.getBestLapTime();
        scania.getMaxSpeed();
        System.out.println(Truck.LoadCapacity.N3);
        scania.printType();
        System.out.println();

        Driver2<Truck> john = new Driver2<>("John","Категория C",15);
        john.startMoving(kamaz);
        System.out.println();
        Race.diagnosticTransport(kamaz,volvo,man,scania);
        System.out.println();

        Bus liaz = new Bus("ЛиАЗ","500",5.2);
        Bus gazel = new Bus("Газель","Next",4.2);
        Bus maz = new Bus("МАЗ","Н200",3.0);
        Bus volvoX = new Bus("Volvo","X650",7.5);

        liaz.getPitStop();
        liaz.getBestLapTime();
        liaz.getMaxSpeed();
        System.out.println(Bus.SeatCapacity.S);
        liaz.printType();
        System.out.println();

        gazel.getPitStop();
        gazel.getBestLapTime();
        gazel.getMaxSpeed();
        System.out.println(Bus.SeatCapacity.XS);
        gazel.printType();
        System.out.println();

        maz.getPitStop();
        maz.getBestLapTime();
        maz.getMaxSpeed();
        System.out.println(Bus.SeatCapacity.XL);
        maz.printType();
        System.out.println();

        volvoX.getPitStop();
        volvoX.getBestLapTime();
        volvoX.getMaxSpeed();
        System.out.println(Bus.SeatCapacity.XXL);
        volvoX.printType();
        System.out.println();

        Driver3<Bus> max = new Driver3<>("Max","Категория D",20);
        max.startMoving(liaz);
        System.out.println();
        Race.diagnosticTransport(liaz,gazel,maz,volvoX);
        System.out.println();
    }
}