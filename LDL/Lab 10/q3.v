module q3(cin,x,y,co,s);
input cin,x,y;
output co,s;
wire [0:7]w;
wire [2:0]z;
assign z={cin,x,y};
dec3to8 stage0(1'b1,z,w);
assign co=w[3]|w[5]|w[6]|w[7];
assign s=w[1]|w[2]|w[4]|w[7];
endmodule

module dec3to8 (e,w,y);
input e;
input [2:0]w;
output [0:7]y;
reg [0:7]y;
always @(w)
begin
if(e==0)
assign y=8'b00000000;
else
	case(w)
	0:y=8'b10000000;
	1:y=8'b01000000;
	2:y=8'b00100000;
	3:y=8'b00010000;
	4:y=8'b00001000;
	5:y=8'b00000100;
	6:y=8'b00000010;
	7:y=8'b00000001;
	endcase
end
endmodule
	


