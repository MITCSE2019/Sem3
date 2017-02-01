module mux16to1(w,s,f);
input [15:0]w;
input [3:0]s;
output f;
wire [3:0]g;
mux4to1 stage0(w[3:0],s[1:0],g[0]);
mux4to1 stage1(w[7:4],s[1:0],g[1]);
mux4to1 stage2(w[11:8],s[1:0],g[2]);
mux4to1 stage3(w[15:12],s[1:0],g[3]);
mux4to1 stage4(g,s[3:2],f);
endmodule
