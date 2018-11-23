/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author anupongpummok
 */
public class InvoiceDao implements DaoInterface<Invoice>{
    private static MongoCollection<Invoice> invoiceCol;
    
    public InvoiceDao() {
        invoiceCol = Database.getDatabase().getCollection("invoices", Invoice.class);
    }
    
    public boolean switchStatusById(String invoiceId, String status) {
        try {
            if (status.equals("กำลังเช่า")) {
                invoiceCol.updateOne(
                        eq("invoiceId", invoiceId), 
                        new Document("$set", 
                                new Document("status", "ว่าง")
                        )
                );

            } else if (status.equals("ว่าง")) {
                invoiceCol.updateOne(
                        eq("invoiceId", invoiceId), 
                        new Document("$set", 
                                new Document("status", "กำลังเช่า")
                        )
                );
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public int incrementInvoiceId() {
        return (int) invoiceCol.count()+1;
    }

    @Override
    public boolean insert(Invoice invoice) {
        try {
            invoiceCol.insertOne(invoice);
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean update(String invoiceId, Invoice newInvoice) {
        Gson gson = new Gson();
        Document invoiceDoc = Document.parse(gson.toJson(newInvoice));
        try {
            invoiceCol.updateOne( eq("invoiceId", invoiceId), invoiceDoc);
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invoice getById(String invoiceId) {
        return invoiceCol.find(eq("invoiceId", invoiceId)).first();
    }

    @Override
    public List<Invoice> getAll() {
        return invoiceCol.find().into(new ArrayList<>());
    }
    

}
