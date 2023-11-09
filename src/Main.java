// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehiculos coche = new Vehiculos();
        coche.setCaballos("1063");
        coche.setMatricula("9999 TRB");
        coche.setMarca("Mercedes");
        coche.setModelo("AMG ONE");
        coche.setMotor("V6 a 90° Mercedes-Benz PU106C de 1598 cm³");
        coche.setColor("Negro/Rojo");
        coche.setTipoDeCombustible("gasolina");

        Cliente cliente = new Cliente();
        cliente.setDni("78239834H");
        cliente.setNombre("John");
        cliente.setApellidos("Smith");
        cliente.setDireccion("London, wall wut, n 7263");
        cliente.setCodigoPostal("83243");
        cliente.setTelefono("98127357");

        Ventas venta = new Ventas();
        venta.setCliente(cliente.getFullName());
        venta.setVehículo(coche.getFullName());
        venta.setCodigoDeVenta("1hu893yrg38");
        venta.setFechaDeLaVenta("20/12/2023");
        venta.setFormaDePago("Cheque");
        venta.setPrecioDeVenta("2,5 millones de euros");
        System.out.println(venta.getCliente());
        System.out.println(venta.getVehículo());
        System.out.println(venta.getCodigoDeVenta());
        System.out.println(venta.getFechaDeLaVenta());
        System.out.println(venta.getFormaDePago());
        System.out.println(venta.getPrecioDeVenta());
    }
}