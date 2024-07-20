public class Main {
    public static void main(String[] args) {
        Network network = new Network();

        // Create routers and set their positions (assuming BgpRouter now has x, y positions)
        BgpRouter routerA = new BgpRouter("A", network);  // No x, y specified here
        BgpRouter routerB = new BgpRouter("B", network);  // No x, y specified here
        BgpRouter routerC = new BgpRouter("C", network);  // No x, y specified here

        // Add routers to the network
        network.addRouter(routerA);
        network.addRouter(routerB);
        network.addRouter(routerC);

        // Perform routing table sharing
        routerA.shareRoutingTable();
        routerB.shareRoutingTable();
        routerC.shareRoutingTable();

        // Simulate a route poisoning attack (example)
        RoutePoisoningAttack.poisonRoute(routerC, "A");

        // Visualize the network
        Visualization.setNetwork(network);
        Visualization.visualizeNetwork();
    }
}
