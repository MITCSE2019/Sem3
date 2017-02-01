module mux8to1__2(w,s,f);
input [7:0]w;
input [2:0]s;
output f;
reg f;
always @(s or w)
begin
	if(s[2])
	begin
	if(s[1])
	begin
		begin
		if(s[0])
		f=w[7];
		else
		f=w[6];
		end
	end
	else
	begin
		begin
		if(s[0])
		f=w[5];
		else
		f=w[4];
		end
	end
	end
	else
		begin
	if(s[1])
	begin
		begin
		if(s[0])
		f=w[3];
		else
		f=w[2];
		end
	end
	else
	begin
		begin
		if(s[0])
		f=w[1];
		else
		f=w[0];
		end
	end
	end
end
endmodule
