package seminars.second.hw;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    /**
     * c). Написать следующие тесты:
     * - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
     * - проверка того, объект Car создается с 4-мя колесами
     * - проверка того, объект Motorcycle создается с 2-мя колесами
     * - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
     * - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
     * - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
     * - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */


    @Test
    void carIsVehicle() {
        // Arrange
        Car car = new Car("company", "model", 2020);
        // Assert
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carHas4Wheels() {
        // Arrange
        Car car = new Car("company", "model", 2020);
        // Assert
        assertThat(car.getNumWheels()).isEqualTo(4);

    }

    @Test
    void motorcycleHas2Wheels() {
        // Arrange
        Motorcycle motorcycle = new Motorcycle("company", "model", 2020);
        // Assert
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);

    }

    @Test
    void carSpeed60TestDrive() {
        // Arrange
        Car car = new Car("company", "model", 2020);
        // Act
        car.testDrive();
        // Assert
        assertThat(car.getSpeed()).isEqualTo(60);

    }

    @Test
    void motorcycleSpeed75TestDrive() {
        // Arrange
        Motorcycle motorcycle = new Motorcycle("company", "model", 2020);
        // Act
        motorcycle.testDrive();
        // Assert
        assertThat(motorcycle.getSpeed()).isEqualTo(75);

    }


    @Test
    void carParkingStop() {
        // Arrange
        Car car = new Car("company", "model", 2020);
        // Act
        car.testDrive();
        car.park();
        // Assert
        assertThat(car.getSpeed()).isEqualTo(0);

    }

    @Test
    void motorcycleParkingStop() {
        // Arrange
        Motorcycle motorcycle = new Motorcycle("company", "model", 2020);
        // Act
        motorcycle.testDrive();
        motorcycle.park();
        // Assert
        assertThat(motorcycle.getSpeed()).isEqualTo(0);

    }


}