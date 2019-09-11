//© A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class - 
//Lab  -

public class HistoTree
{
   private TreeNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		if(search(data)==null)
		{
		   root=add(data,root);
		}
		else
		{
			TreeNode found = search(data);
			((ThingCount)found.getValue()).setCount(((ThingCount)found.getValue()).getCount()+1);
		}
	}

	private TreeNode add(Comparable data, TreeNode tree)
	{
		if(tree==null)
		   return new TreeNode(new ThingCount(data, 1), null, null);

		int dirTest=data.compareTo(((ThingCount)tree.getValue()).getThing());
		if(dirTest<0)
		{
			tree.setLeft(add(data,tree.getLeft()));
		}
		else if(dirTest>0)
		{
			tree.setRight(add(data,tree.getRight()));
		}
		return tree;
	}

	private TreeNode search(Comparable data)
	{
		return search(data,root);
	}

	private TreeNode search(Comparable data, TreeNode tree)
	{
		if(tree==null)
		   return null;

		int dirTest=data.compareTo(((ThingCount)tree.getValue()).getThing());
		if(dirTest==0)
		   return tree;
		else if(dirTest<0)
		{
			return search(data,tree.getLeft());
		}
		else if(dirTest>0)
		{
			return search(data,tree.getRight());
		}
		return null;
	}

	public String toString()
	{
		return toString(root).trim();
	}

	private String toString(TreeNode tree)
	{
		if(tree==null)
		   return "";
		return ""+toString(tree.getLeft())+ " " + tree.getValue() + "   " + toString(tree.getRight());
	}
}