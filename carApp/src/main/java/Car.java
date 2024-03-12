public class Car {
    public static final int SPEED_INCREMENT = 10;
    public static final int MAX_SPEED = 120;
    public static final int SPEED_UNIT = 10;
    public static final int STARTED = 0;
    private String model;
    private String color;
    private int speed;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + SPEED_INCREMENT <= MAX_SPEED) {
            speed += SPEED_INCREMENT;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowing() {
        if (speed - SPEED_UNIT >= STARTED) {
            speed -= SPEED_UNIT;
            // afficher détails
            System.out.println("Modèle : " + model);
            System.out.println("Couleur : " + color);
            System.out.println("Vitesse actuelle : " + speed);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    public void startCar(Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getName() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Driver driver) {
        System.out.println(driver.getName() + " arrête la car.");
    }

    public void changeSpeed(int newSpeed, Driver driver) {
        System.out.println(driver.getName() + " change la vitesse de la voiture à " + newSpeed);
        if (getSpeed() >= newSpeed) {
            while (getSpeed() > newSpeed) {
                slowing();
            }
        } else  {
            while (getSpeed() < newSpeed) {
                accelerate();
            }
        }
    }
}

