module bin2gray(b,g);
parameter n=4;
input [n-1:0]b;
output [n-1:0]g;
reg [n-1:0]g;
integer k;
always@(b)
	begin
		g[n-1]=b[n-1];
		for(k=n-2;k>=0;k=k-1)
			begin
				g[k]=b[k+1]^b[k];
			end
	end
endmodule
