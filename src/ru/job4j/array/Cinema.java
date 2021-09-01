package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        for (int row = 0; row < places.length; row++) {
            for (int cell = 0; cell < places[row].length; cell++) {
                // Проверка что место не занято
                if (places[row][cell] == null) {
                    //Условия
                    // Левый верхний угол
                    if (row == 0 && cell == 0) {
                        if (places[1][0] == null && places[0][1] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Правый верхний угол
                    if (row == 0 && cell == places.length - 1) {
                        if (places[0][places.length - 2] == null && places[1][places.length - 1] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Левый нижнний угол
                    if (row == places.length - 1 && cell == 0) {
                        if (places[places.length - 2][0] == null && places[places.length - 1][1] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Правый нижнний угол
                    if (row == places.length - 1 && cell == places.length - 1) {
                        if (places[places.length - 1][places.length - 2] == null && places[places.length - 2][places.length - 1] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Верхний ряд
                    if (row == 0 && cell != 0 && cell != places.length - 1) {
                        if (places[0][cell - 1] == null && places[0][cell + 1] == null && places[1][cell] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Нижний ряд
                    if (row == places.length - 1 && cell != 0 && cell != places.length - 1) {
                        if (places[row][cell - 1] == null && places[row][cell + 1] == null && places[row - 1][cell] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Левый ряд
                    if (row != 0 && row != places.length - 1 && cell == 0) {
                        if (places[row][cell + 1] == null && places[row - 1][cell] == null && places[row + 1][cell] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Правый ряд
                    if (row != 0 && row != places.length - 1 && cell == places.length - 1) {
                        if (places[row][cell - 1] == null && places[row - 1][cell] == null && places[row + 1][cell] == null) {
                            return new Place(row, cell);
                        }
                    }
                    // Средний ряд
                    if (row != 0 && row != places.length - 1 && cell != 0 && cell != places.length - 1) {
                        if (places[row][cell + 1] == null && places[row][cell - 1] == null
                                && places[row - 1][cell] == null && places[row + 1][cell] == null) {
                            return new Place(row, cell);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row
                    && cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}
