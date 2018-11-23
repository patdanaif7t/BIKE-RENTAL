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
public class BikeDao {
    
    private static MongoCollection<Bike> bikeCol;
    
    public BikeDao() {
        bikeCol = Database.getDatabase().getCollection("bikes", Bike.class);
    } 
    
    public boolean addBike(Bike bike) {
        try {
            bikeCol.insertOne(bike);     
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Bike getBikeById(String bikeId) {
        return bikeCol.find(eq("bikeId", bikeId)).first();
    }
    
    public List<Bike> getAllBike() {
        return bikeCol.find().into(new ArrayList<>());
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
    
}
