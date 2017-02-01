module fmux16to1(w,f,s);
input [15:0]w;
input [3:0]s;
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

wire [3:0]g;
assign g[0]=mux(w[3:0],s[1:0]);
assign g[1]=mux(w[7:4],s[1:0]);
assign g[2]=mux(w[11:8],s[1:0]);
assign g[3]=mux(w[15:12],s[1:0]);
assign f=mux(g,s[3:2]);
endmodule
