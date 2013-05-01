package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.chronos.shared.Account;
import edu.ycp.cs320.chronos.shared.Event;
/*
import edu.ycp.cs320.chronos.modelClasses.Account;
import edu.ycp.cs320.chronos.modelClasses.Event;
*/
@RemoteServiceRelativePath("eventManagement")
public interface EventManagementService extends RemoteService {

	public void createEvent(int ownerID, String eventName, int month, int day, int year, int startTime,
			int endTime, String details);
	public Boolean isDupEvent(String eventName);
	public void removeEvent(Event event);
	public Event getNextEvent(Account user, int month, int day, int year);
	public Event findEvent(int eventID);
	public int getMonth(int eventID);
	public int getDay(int eventID);
	public int getYear(int eventID);
	public int getStartTime(int eventID);
	public int getEndTime(int eventID);
	public String getDetails(int eventID);
}
