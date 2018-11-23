/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikerental;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author anupongpummok
 */
public class BikeDao implements DaoInterface<Bike> {
    
    private static MongoCollection<Bike> bikeCol;
    
    public BikeDao() {
        bikeCol = Database.getDatabase().getCollection("bikes", Bike.class);
    } 
    
    public boolean switchStatusById(String bikeId, String status) {
        try {
            if (status.equals("ถูกเช่า")) {
                bikeCol.updateOne(
                        eq("bikeId", bikeId), 
                        new Document("$set", 
                                new Document("bikeStatus", "ว่าง")
                        )
                );

            } else if (status.equals("ว่าง")) {
                bikeCol.updateOne(
                        eq("bikeId", bikeId), 
                        new Document("$set", 
                                new Document("bikeStatus", "ถูกเช่า")
                        )
                );
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insert(Bike bike) {
        try {
            bikeCol.insertOne(bike);     
            return true;
        } catch (Exception e) {
            return false;
        }    }

    @Override
    public boolean update(String id, Bike newObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bike getById(String bikeId) {
        return bikeCol.find(eq("bikeId", bikeId)).first();
    }

    @Override
    public List<Bike> getAll() {
        return bikeCol.find().into(new ArrayList<>());
    }
    
}
