package part1;

public class Term2Node implements Node{
	public Term2Node(FactorNode factorNode2, Term2Node term2Node2) {
		this.factorNode = factorNode2;
		this.term2Node = term2Node2;
	}
	public FactorNode factorNode;
	public Term2Node term2Node;
	@Override
	public int value() {
		if(term2Node == null)
			return factorNode.value();
		else
			return factorNode.value() & term2Node.value();
		
	}
}
