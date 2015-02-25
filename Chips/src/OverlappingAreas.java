
public class OverlappingAreas 
{
	private int row, column, length = 0;
	//set row to input integer
	public OverlappingAreas(int r, int c, int l)
	{
		row = r;
		column = c;
		length = l;
	}
	public void setRow(int r)
	{
		row = r;
	}
	//set column to input integer
	public void setCol(int c)
	{
		column = c;
	}
	public int row()
	{
		return row;
	}
	public int col()
	{
		return column;
	}
	public int length()
	{
		return length;
	}
}
