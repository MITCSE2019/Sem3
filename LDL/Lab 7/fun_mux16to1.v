module fun_mux16to1 (w,s,f);
input [15:0]w;
input [3:0]s;
output f;

function mux;
input [15:0]w;
input [3:0]s;
case (s)
	0:mux =w[0];
	1:mux =w[1];
	2:mux =w[2];
	3:mux =w[3];
	4:mux =w[4];
	5:mux =w[5];
	6:mux =w[6];
	7:mux =w[7];
	8:mux =w[8];
	9:mux =w[9];
	10:mux=w[10];
	11:mux=w[11];
	12:mux=w[12];
	13:mux=w[13];
	14:mux=w[14];
	15:mux=w[15];
endcase
endfunction

assign f=mux(w,s);
endmodule
