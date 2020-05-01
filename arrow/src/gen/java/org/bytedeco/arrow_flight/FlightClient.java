// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_flight;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.arrow_flight.*;


/** \brief Client class for Arrow Flight RPC services (gRPC-based).
 *  API experimental for now */
@Namespace("arrow::flight") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_flight.class)
public class FlightClient extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlightClient(Pointer p) { super(p); }


  /** \brief Connect to an unauthenticated flight service
   *  @param location [in] the URI
   *  @param client [out] the created FlightClient
   *  @return Status OK status may not indicate that the connection was
   *  successful */
  public static native @ByVal Status Connect(@Const @ByRef Location location, @UniquePtr FlightClient client);

  /** \brief Connect to an unauthenticated flight service
   *  @param location [in] the URI
   *  @param options [in] Other options for setting up the client
   *  @param client [out] the created FlightClient
   *  @return Status OK status may not indicate that the connection was
   *  successful */
  public static native @ByVal Status Connect(@Const @ByRef Location location, @Const @ByRef FlightClientOptions options,
                          @UniquePtr FlightClient client);

  /** \brief Authenticate to the server using the given handler.
   *  @param options [in] Per-RPC options
   *  @param auth_handler [in] The authentication mechanism to use
   *  @return Status OK if the client authenticated successfully */
  public native @ByVal Status Authenticate(@Const @ByRef FlightCallOptions options,
                        @UniquePtr ClientAuthHandler auth_handler);

  /** \brief Perform the indicated action, returning an iterator to the stream
   *  of results, if any
   *  @param options [in] Per-RPC options
   *  @param action [in] the action to be performed
   *  @param results [out] an iterator object for reading the returned results
   *  @return Status */
  public native @ByVal Status DoAction(@Const @ByRef FlightCallOptions options, @Const @ByRef Action action,
                    @UniquePtr ResultStream results);
  public native @ByVal Status DoAction(@Const @ByRef Action action, @UniquePtr ResultStream results);

  /** \brief Retrieve a list of available Action types
   *  @param options [in] Per-RPC options
   *  @param actions [out] the available actions
   *  @return Status */
  public native @ByVal Status ListActions(@Const @ByRef FlightCallOptions options, @StdVector ActionType actions);
  public native @ByVal Status ListActions(@StdVector ActionType actions);

  /** \brief Request access plan for a single flight, which may be an existing
   *  dataset or a command to be executed
   *  @param options [in] Per-RPC options
   *  @param descriptor [in] the dataset request, whether a named dataset or
   *  command
   *  @param info [out] the FlightInfo describing where to access the dataset
   *  @return Status */
  public native @ByVal Status GetFlightInfo(@Const @ByRef FlightCallOptions options,
                         @Const @ByRef FlightDescriptor descriptor,
                         @UniquePtr FlightInfo info);
  public native @ByVal Status GetFlightInfo(@Const @ByRef FlightDescriptor descriptor,
                         @UniquePtr FlightInfo info);

  /** \brief Request schema for a single flight, which may be an existing
   *  dataset or a command to be executed
   *  @param options [in] Per-RPC options
   *  @param descriptor [in] the dataset request, whether a named dataset or
   *  command
   *  @param schema_result [out] the SchemaResult describing the dataset schema
   *  @return Status */
  public native @ByVal Status GetSchema(@Const @ByRef FlightCallOptions options, @Const @ByRef FlightDescriptor descriptor,
                     @UniquePtr SchemaResult schema_result);
  public native @ByVal Status GetSchema(@Const @ByRef FlightDescriptor descriptor,
                     @UniquePtr SchemaResult schema_result);

  /** \brief List all available flights known to the server
   *  @param listing [out] an iterator that returns a FlightInfo for each flight
   *  @return Status */
  public native @ByVal Status ListFlights(@UniquePtr FlightListing listing);

  /** \brief List available flights given indicated filter criteria
   *  @param options [in] Per-RPC options
   *  @param criteria [in] the filter criteria (opaque)
   *  @param listing [out] an iterator that returns a FlightInfo for each flight
   *  @return Status */
  public native @ByVal Status ListFlights(@Const @ByRef FlightCallOptions options, @Const @ByRef Criteria criteria,
                       @UniquePtr FlightListing listing);

  /** \brief Given a flight ticket and schema, request to be sent the
   *  stream. Returns record batch stream reader
   *  @param options [in] Per-RPC options
   *  @param ticket [in] The flight ticket to use
   *  @param stream [out] the returned RecordBatchReader
   *  @return Status */
  public native @ByVal Status DoGet(@Const @ByRef FlightCallOptions options, @Const @ByRef Ticket ticket,
                 @UniquePtr FlightStreamReader stream);
  
  ///
  ///
  public native @ByVal Status DoGet(@Const @ByRef Ticket ticket, @UniquePtr FlightStreamReader stream);

  /** \brief Upload data to a Flight described by the given
   *  descriptor. The caller must call Close() on the returned stream
   *  once they are done writing.
   * 
   *  The reader and writer are linked; closing the writer will also
   *  close the reader. Use \a DoneWriting to only close the write
   *  side of the channel.
   * 
   *  @param options [in] Per-RPC options
   *  @param descriptor [in] the descriptor of the stream
   *  @param schema [in] the schema for the data to upload
   *  @param stream [out] a writer to write record batches to
   *  @param reader [out] a reader for application metadata from the server
   *  @return Status */
  public native @ByVal Status DoPut(@Const @ByRef FlightCallOptions options, @Const @ByRef FlightDescriptor descriptor,
                 @Const @SharedPtr @ByRef Schema schema,
                 @UniquePtr FlightStreamWriter stream,
                 @UniquePtr FlightMetadataReader reader);
  public native @ByVal Status DoPut(@Const @ByRef FlightDescriptor descriptor, @Const @SharedPtr @ByRef Schema schema,
                 @UniquePtr FlightStreamWriter stream,
                 @UniquePtr FlightMetadataReader reader);
}
