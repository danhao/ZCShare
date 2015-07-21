package com.zc.web.util;

import static io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_ALLOW_HEADERS;
import static io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_ALLOW_METHODS;
import static io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_ALLOW_ORIGIN;
import static io.netty.handler.codec.http.HttpHeaders.Names.ACCESS_CONTROL_MAX_AGE;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_LENGTH;
import static io.netty.handler.codec.http.HttpHeaders.Names.CONTENT_TYPE;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.util.CharsetUtil;

import org.apache.log4j.Logger;

public class NettyUtil {
	private static final Logger logger = Logger.getLogger(NettyUtil.class);
	
	/**
	 * 发送http响应数据(发送完关闭连接)
	 * @param contentType
	 * @param channel
	 * @param content
	 */
	public static void sendHttpResponse(Channel channel, String content){
		FullHttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, Unpooled.copiedBuffer(content, CharsetUtil.UTF_8));
		response.headers().set(CONTENT_TYPE, "text/html");
        response.headers().set(CONTENT_LENGTH, response.content().readableBytes());
        response.headers().set(ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        response.headers().set(ACCESS_CONTROL_ALLOW_METHODS, "POST");
        response.headers().set(ACCESS_CONTROL_MAX_AGE, "3600");
        response.headers().set(ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type, Authorization, Accept,X-Requested-With");
        channel.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
	}
	
	/**
	 * 发送数据给客户端
	 * @param channel
	 * @param message
	 */
//	public static ChannelFuture sendMessage2Client(Channel channel, PBMessage message){
//		if(channel == null || !channel.isOpen()){
//			return null;
//		}
//		ByteBuf buf = Unpooled.buffer(message.getSerializedSize());
//		buf.writeBytes(message.toByteArray());
//		return channel.writeAndFlush(new BinaryWebSocketFrame(buf));
//	}
	
}
