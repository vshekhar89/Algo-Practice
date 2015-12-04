package general;

public class  ViewDeal{

    public static String contactId= ApexPages.currentPage().getParameters().get('contactId');
    
    public static List<Deal_Action__c> dealActionList;
    public static Map<String, String> actionList;
    public static List<DisplayDeals> dealList;
    private ApexPages.StandardSetController setCon;
    
    public Contact getContact(){
         Contact contact= [Select c.Title, c.Salutation,  
                          c.PhotoUrl,c.Name,c.Id, c.FirstName,c.Deals_Rejected__c, c.Deals_Accepted__c,  
                          c.Acceptance_Rate__c From Contact c where id= :contactId];  
              return contact;             
      }
    
    
    
   public PageReference rejectDeal() {
        Deal_Action__c dealAction= new Deal_Action__c();
        dealAction.Action__c= 'Rejected';
        dealAction.Contact__c=contactId;
        //String deal_name= System.currentPageReference().getParameters().get('deal_name');
        String deal_name= ApexPages.currentPage().getParameters().get('deal_name');
        System.debug(deal_name);
        List<Deal__c> rejectedDeal= new List<Deal__c>();
        rejectedDeal = [Select d.Valid_Through__c, d.SystemModstamp, d.Rejections__c, 
                                d.OwnerId, d.Name, d.Max_Acceptances__c, d.LastViewedDate, 
                                d.LastReferencedDate, d.LastModifiedDate, d.LastModifiedById, 
                                d.LastActivityDate, d.IsDeleted, d.Id, d.CreatedDate, 
                                d.CreatedById, d.Available_Deals__c, d.Acceptances__c, 
                                d.Acceptance_Rate__c From Deal__c d where name= :deal_name];
        dealAction.Deal__c = rejectedDeal[0].Id;
		insert dealAction;
        rejectedDeal[0].Rejections__c= rejectedDeal[0].Rejections__c+1;
        update rejectedDeal[0];
        Contact contact= [Select c.Title, c.SystemModstamp, c.Salutation, c.ReportsToId, 
                          c.PhotoUrl, c.Phone, c.OwnerId, c.OtherStreet, c.OtherState, 
                          c.OtherPostalCode, c.OtherPhone, c.OtherLongitude, 
                          c.OtherLatitude, c.OtherCountry, c.OtherCity, 
                          c.OtherAddress, c.Name, c.MobilePhone, c.MasterRecordId, 
                          c.MailingStreet, c.MailingState, c.MailingPostalCode, 
                          c.MailingLongitude, c.MailingLatitude, c.MailingCountry, 
                          c.MailingCity, c.MailingAddress, c.LeadSource, c.LastViewedDate, 
                          c.LastReferencedDate, c.LastName, c.LastModifiedDate, c.LastModifiedById, 
                          c.LastCUUpdateDate, c.LastCURequestDate, c.LastActivityDate, 
                          c.JigsawContactId, c.Jigsaw, c.IsEmailBounced, c.IsDeleted, c.Id, 
                          c.HomePhone, c.FirstName, c.Fax, c.EmailBouncedReason, c.EmailBouncedDate, 
                          c.Email, c.Description, c.Department, c.Deals_Rejected__c, 
                          c.Deals_Accepted__c, c.CreatedDate, c.CreatedById, c.CleanStatus, 
                          c.Birthdate, c.AssistantPhone, c.AssistantName, c.AccountId, 
                          c.Acceptance_Rate__c From Contact c where id= :contactId];
        contact.Deals_Rejected__c= contact.Deals_Rejected__c+1;
        update contact;
        return null;
    }


    public PageReference acceptDeal() {
        Deal_Action__c dealAction= new Deal_Action__c();
        dealAction.Action__c= 'Accepted';
        dealAction.Contact__c=contactId;
        //String deal_name= System.currentPageReference().getParameters().get('deal_name');
        String deal_name= ApexPages.currentPage().getParameters().get('deal_name');
        System.debug(deal_name);
        List<Deal__c> acceptedDeal= new List<Deal__c>();
        acceptedDeal = [Select d.Valid_Through__c, d.SystemModstamp, d.Rejections__c, 
                                d.OwnerId, d.Name, d.Max_Acceptances__c, d.LastViewedDate, 
                                d.LastReferencedDate, d.LastModifiedDate, d.LastModifiedById, 
                                d.LastActivityDate, d.IsDeleted, d.Id, d.CreatedDate, 
                                d.CreatedById, d.Available_Deals__c, d.Acceptances__c, 
                                d.Acceptance_Rate__c From Deal__c d where name= :deal_name];
        dealAction.Deal__c = acceptedDeal[0].Id;
		insert dealAction;
        acceptedDeal[0].Acceptances__c= acceptedDeal[0].Acceptances__c+1;
        update acceptedDeal[0];
        Contact contact= [Select c.Title, c.SystemModstamp, c.Salutation, c.ReportsToId, 
                          c.PhotoUrl, c.Phone, c.OwnerId, c.OtherStreet, c.OtherState, 
                          c.OtherPostalCode, c.OtherPhone, c.OtherLongitude, 
                          c.OtherLatitude, c.OtherCountry, c.OtherCity, 
                          c.OtherAddress, c.Name, c.MobilePhone, c.MasterRecordId, 
                          c.MailingStreet, c.MailingState, c.MailingPostalCode, 
                          c.MailingLongitude, c.MailingLatitude, c.MailingCountry, 
                          c.MailingCity, c.MailingAddress, c.LeadSource, c.LastViewedDate, 
                          c.LastReferencedDate, c.LastName, c.LastModifiedDate, c.LastModifiedById, 
                          c.LastCUUpdateDate, c.LastCURequestDate, c.LastActivityDate, 
                          c.JigsawContactId, c.Jigsaw, c.IsEmailBounced, c.IsDeleted, c.Id, 
                          c.HomePhone, c.FirstName, c.Fax, c.EmailBouncedReason, c.EmailBouncedDate, 
                          c.Email, c.Description, c.Department, c.Deals_Rejected__c, 
                          c.Deals_Accepted__c, c.CreatedDate, c.CreatedById, c.CleanStatus, 
                          c.Birthdate, c.AssistantPhone, c.AssistantName, c.AccountId, 
                          c.Acceptance_Rate__c From Contact c where id= :contactId];
        contact.Deals_Accepted__c= contact.Deals_Accepted__c+1;
        update contact;
        return null;
    }
    
    public List<DisplayDeals> getDeals(){
      
         	dealActionList=[Select action__c, deal__r.name from deal_action__c where contact__c=:contactId];
            actionList= new Map<String,String>();
        for(Deal_Action__c dealAction : dealActionList){
            actionList.put(dealAction.Deal__r.name, dealAction.Action__c);
        }
        if(dealList==null){
            dealList = new List<DisplayDeals>();
            for(Deal__c item: [Select Name, 
                               Valid_Through__c, Available_Deals__c From Deal__c d])
            {
               dealList.add(new DisplayDeals(item));
            }
        }
        
      return dealList;
    }
    
   
   
    public class DisplayDeals{
        private Deal__c availDeals;
       
        
        public DisplayDeals(Deal__c item){
            this.availDeals= item;
            
        }
        
      
        public String status{
            get{if(actionList.containsKey(availDeals.Name)){
                 
                return actionList.get(availDeals.Name);}
                
                else return 'Available';}
            
        }
        
        public String getUrl{
            get{return URL.getSalesforceBaseUrl().toExternalForm()+'/resource'+'/'+availDeals.Name;
}
        }
         public Boolean isAccepted{
            get{if(actionList.containsKey(availDeals.Name)){
                  
                return true;}
                
                else return false;}
            
        }
        public String name{
            get{return availDeals.Name;}
        }
        
        public Date validThru{
            get{return availDeals.Valid_Through__c;}
        }
        
        public Decimal availableDeals{
            get{return availDeals.Available_Deals__c;}
        }
    }
    
}