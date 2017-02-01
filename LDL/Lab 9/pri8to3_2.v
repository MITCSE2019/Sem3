module pri8to3_2(w,y,z);
input [7:0]w;
output [2:0]y;
output z;
reg[2:0]y;
reg z;
always @ (w)
begin
z=1;
casex(w)
8'b00000000:z=0;
8'b00000001:y=0;
8'b0000001X:y=1;
8'b000001XX:y=2;
8'b00001XXX:y=3;
8'b0001XXXX:y=4;
8'b001XXXXX:y=5;
8'b01XXXXXX:y=6;
8'b1XXXXXXX:y=7;
endcase
end
endmodule
