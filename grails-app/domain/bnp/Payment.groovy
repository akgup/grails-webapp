package bnp

class Payment {

    static constraints = {
    }

    Date dateCreated
    Date dateUpdated

    static mapping = {
    	table 'payment_info'
    	dateCreated type : 'timestamp'
    	dateUpdated type : 'timestamp'
    }
}
