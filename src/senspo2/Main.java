/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senspo2;

import sas.po2.lib.EdgeWeightedDigraph;

/**
 *
 * @author Sven
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creates a tileworld
        EdgeWeightedDigraph diagraph1 = new EdgeWeightedDigraph("i1");
        Dijkstra dijkstra1 = new Dijkstra(diagraph1, diagraph1.getStart());
        System.out.println("Costs: " + dijkstra1.distTo(diagraph1.getEnd())); 
        diagraph1.tekenPad(dijkstra1.pathTo(diagraph1.getEnd()));
        System.out.println("Number of visited i1: " + dijkstra1.getNumberOfSearched());
        System.out.println("Number of Tiles of the SP i1 " + dijkstra1.getNumberOfTilesOfSP());
        diagraph1.show("i1", "Image i1");
        diagraph1.save("i1");
    }
    
}
