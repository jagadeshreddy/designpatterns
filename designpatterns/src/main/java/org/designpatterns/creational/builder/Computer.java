package org.designpatterns.creational.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String gpu;

    private Computer() {
    }

    private Computer(String cpu, String ram, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
    }

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.gpu = builder.gpu;
    }


    public static class Builder {
        private String cpu;
        private String ram;
        private String gpu;

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }


    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
