/* Generated Java Source File */
/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.messages;

import quickfix.Message;
import quickfix.Group;

public class MessageFactory implements quickfix.MessageFactory {

	public Message create(String beginString, String msgType) {
		
		switch (msgType) {
	
			case quickfix.messages.Heartbeat.MSGTYPE:
				return new quickfix.messages.Heartbeat();
	
			case quickfix.messages.Logon.MSGTYPE:
				return new quickfix.messages.Logon();
	
			case quickfix.messages.AutionMatch.MSGTYPE:
				return new quickfix.messages.AutionMatch();
	
			case quickfix.messages.BoardInfo.MSGTYPE:
				return new quickfix.messages.BoardInfo();
	
			case quickfix.messages.DerivativesInfo.MSGTYPE:
				return new quickfix.messages.DerivativesInfo();
	
			case quickfix.messages.Index.MSGTYPE:
				return new quickfix.messages.Index();
	
			case quickfix.messages.Stock.MSGTYPE:
				return new quickfix.messages.Stock();
	
			case quickfix.messages.StockInfo.MSGTYPE:
				return new quickfix.messages.StockInfo();
	
			case quickfix.messages.TopNPrice.MSGTYPE:
				return new quickfix.messages.TopNPrice();
	
			case quickfix.messages.TopPriceOddLot.MSGTYPE:
				return new quickfix.messages.TopPriceOddLot();
	
		}

		return new quickfix.messages.Message();
	}

	public Group create(String beginString, String msgType, int correspondingFieldID) {
		
		switch (msgType) {
	
			case quickfix.messages.TopNPrice.MSGTYPE:
				switch (correspondingFieldID) {
			
				case quickfix.fields.NoTopPrice.FIELD:
					return new quickfix.messages.TopNPrice.NoTopPrice();
	
				}
				break;
	
		}

		return null;
	}
}
