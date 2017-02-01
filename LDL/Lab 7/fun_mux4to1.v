
module fun_mux4to1 (w,s,f);
input [3:0]w;
input [1:0]s;
output f;

function mux;
input [3:0]w;
input [1:0]s;
case (s)
	0:mux =w[0];
	1:mux =w[1];
	2:mux =w[2];
	3:mux =w[3];
endcase
endfunction

assign f= mux (w,s);
endmodule


