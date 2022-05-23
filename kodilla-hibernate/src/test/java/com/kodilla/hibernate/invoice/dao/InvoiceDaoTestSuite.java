package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private InvoiceDao invoiceDao;


    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Food");
        Product product1 = new Product("Drink");
        Item item = new Item (new BigDecimal(100), 20, new BigDecimal(2000));
        Item item1 = new Item(new BigDecimal(500), 10, new BigDecimal(5000));
        item.setProduct(product);
        item1.setProduct(product1);
        product.getItems().add(item);
        product.getItems().add(item1);

        Invoice invoice = new Invoice("Invoice no 1");
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);


        //When
        productDao.save(product);
        productDao.save(product1);
        invoiceDao.save(invoice);
        itemDao.save(item);
        itemDao.save(item1);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
