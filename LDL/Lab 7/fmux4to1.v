module fmux4to1(w,s,f);
input [3:0]w;
input [1:0]s;
output f;
function mux;
input [1:0]w;
input s;
case(s)
	1'b0:mux=w[0];
	1'b1:mux=w[1];
endcase
endfunction

wire[1:0]g;
assign g[0]=mux(w[1:0],s[0]);
assign g[1]=mux(w[3:2],s[0]);
assign f=mux(g,s[1]);
endmodule
